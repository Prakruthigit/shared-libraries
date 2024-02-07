def runPipeline(environmentName, lambdaName)
{
   if ("$environmentName" == 'dev' )
    {
            sh "mv my_deployment.zip ${environmentName}_deployment.zip"
            withCredentials([string(credentialsId: 'access_key', variable: 'ACCESS_KEY'), string(credentialsId: 'secret_key', variable: 'SECRET_KEY')]) {
				sh "aws lambda update-function-code --function-name ${lambdaName} --zip-file fileb://./${environmentName}_deployment.zip"
			}
    }
	if ("$environmentName" == 'qa' )
    {
            sh "mv my_deployment.zip ${environmentName}_deployment.zip"
            withCredentials([string(credentialsId: 'access_key', variable: 'ACCESS_KEY'), string(credentialsId: 'secret_key', variable: 'SECRET_KEY')]) {
				sh "aws lambda update-function-code --function-name ${lambdaName} --zip-file fileb://./${environmentName}_deployment.zip"
			}
    }
	if ("$environmentName" == 'staging' )
    {
            sh "mv my_deployment.zip ${environmentName}_deployment.zip"
            withCredentials([string(credentialsId: 'access_key', variable: 'ACCESS_KEY'), string(credentialsId: 'secret_key', variable: 'SECRET_KEY')]) {
				sh "aws lambda update-function-code --function-name ${lambdaName} --zip-file fileb://./${environmentName}_deployment.zip"
			}
    }
	if ("$environmentName" == 'master' )
    {
            sh "mv my_deployment.zip ${environmentName}_deployment.zip"
            withCredentials([string(credentialsId: 'access_key', variable: 'ACCESS_KEY'), string(credentialsId: 'secret_key', variable: 'SECRET_KEY')]) {
				sh "aws lambda update-function-code --function-name ${lambdaName} --zip-file fileb://./${environmentName}_deployment.zip"
			}
    }
}

def echoCommand(){
	echo "Shared libraries success"
}
