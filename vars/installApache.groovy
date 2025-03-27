def call() {
    echo "Executing Ansible playbook to install Apache..."
    
    // Run Ansible with sudo and specify the user
    sh 'ansible-playbook -i /etc/ansible/hosts ansible/apache_setup.yaml --become --become-user=root'
}
