// vars/installApache.groovy
def call() {
    echo "Executing Ansible playbook to install Apache..."
    sh 'ansible-playbook -i /etc/ansible/hosts vars/apache_setup.yaml'
    echo "Apache installation completed!"
}
