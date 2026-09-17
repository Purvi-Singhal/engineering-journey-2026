# DevOps & Cloud Engineering

> Containerization, CI/CD automation, cloud infrastructure, Linux systems, and orchestration.

---

## 1. Overview

This directory covers DevOps practices, infrastructure automation, container workflows, and cloud-native architecture principles required to deploy, monitor, and scale modern applications.

---

## 2. Topics Covered

- **Linux Administration**: File system hierarchies, user permissions, process management, networking, systemd, and bash scripting
- **Containerization (Docker)**: Multi-stage builds, Docker Compose, layer caching optimization, network modes, and rootless containers
- **CI/CD Pipelines**: GitHub Actions workflow automation, automated testing, linting, semantic versioning, and container registry publishing
- **Cloud Foundations**: AWS/GCP essentials (Compute, IAM, S3/Cloud Storage, VPCs, Serverless functions)
- **Infrastructure as Code (IaC)**: Terraform basics, module design, state management, and declarative setups
- **Container Orchestration & Monitoring**: Kubernetes architecture (Pods, Services, Deployments, Ingress), Prometheus, and Grafana

---

## 3. Directory Structure

```text
06-devops/
├── README.md
├── linux/                # Linux system administration and shell scripts
├── docker/               # Dockerfiles, compose stacks, and optimization notes
├── ci-cd/                # GitHub Actions workflows and automation recipes
└── cloud/                # Cloud architecture diagrams and IaC configurations
```

---

## 4. Engineering Standards

- Use multi-stage Docker builds to keep image sizes minimal and secure.
- Pin dependency versions and base image tags in build configurations.
- Store sensitive credentials exclusively in CI secrets or secret managers.
