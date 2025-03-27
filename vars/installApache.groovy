def call() {
    echo "Executing Ansible playbook to install Apache..."
    
    sh """
        ansible-playbook -i /etc/ansible/hosts ansible/apache_setup.yaml
    """
    
    echo "Apache installation completed!"
}
