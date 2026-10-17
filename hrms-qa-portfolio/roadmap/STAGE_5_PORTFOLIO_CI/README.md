# Stage 5 — Git, portfolio and CI
## Git starter
```bash
git init
git add .
git commit -m "Add HRMS QA practice framework"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/hrms-qa-portfolio.git
git push -u origin main
```
Replace the remote URL. Never commit secrets or real credentials.

## Portfolio checklist
- [ ] Completed manual test cases and RTM
- [ ] Saved UI and API test reports
- [ ] Reviewed Cucumber HTML report
- [ ] Logged only real, reproducible bugs
- [ ] Added meaningful Git commits
- [ ] Can explain architecture, waits, assertions, and limitations honestly
Jenkinsfile is a starter; configure JDK 21, Maven, Chrome and headless runtime on your Jenkins agent.
