def call() {
    echo "Executing Ansible playbook to install Apache..."
    
    // Update the path to ansible/apache_setup.yaml
    sh 'ansible-playbook -i /etc/ansible/hosts ansible/apache_setup.yaml'
}
