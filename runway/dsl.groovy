import groovy.json.JsonSlurper

String projectName = "GradleDSLExample"
String repo = 'gdtrivedi/GradleDSLExample'

folder(projectName) {
    description 'This example shows how to create a set of jobs for each github branch, each in its own folder.'
}

URL branchUrl = "https://api.github.com/repos/$repo/branches".toURL()
List branches = new JsonSlurper().parse(branchUrl.newReader())
branches.each { branch ->

    String safeBranchName = branch.name.replaceAll('/', '-')

    folder "$projectName/$safeBranchName"

    job("$projectName/$safeBranchName/build") {
        scm {
            github repo, branch.name
        }
        triggers {
            scm 'H/30 * * * *'
        }
        steps {
            grails 'test-app war', true
        }
    }
}