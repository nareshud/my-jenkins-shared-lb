def call () {
    sh 'cd /var/www/html/ && bin/magento se:up'
}