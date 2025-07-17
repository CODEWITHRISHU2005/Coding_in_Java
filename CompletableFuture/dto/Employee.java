package dto;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private String learningPending;
    private int salary;
    private int rating;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public void setNewJoiner(String newJoiner) {
        this.newJoiner = newJoiner;
    }

    public String getLearningPending() {
        return learningPending;
    }

    public void setLearningPending(String learningPending) {
        this.learningPending = learningPending;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Employee(String employeeId, String firstName, String lastName, String email, String gender, String newJoiner,
            String learningPending, int salary, int rating) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.learningPending = learningPending;
        this.salary = salary;
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((newJoiner == null) ? 0 : newJoiner.hashCode());
        result = prime * result + ((learningPending == null) ? 0 : learningPending.hashCode());
        result = prime * result + salary;
        result = prime * result + rating;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        if (employeeId == null) {
            if (other.employeeId != null) {
                return false;
            }
        } else if (!employeeId.equals(other.employeeId)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (gender == null) {
            if (other.gender != null) {
                return false;
            }
        } else if (!gender.equals(other.gender)) {
            return false;
        }
        if (newJoiner == null) {
            if (other.newJoiner != null) {
                return false;
            }
        } else if (!newJoiner.equals(other.newJoiner)) {
            return false;
        }
        if (learningPending == null) {
            if (other.learningPending != null) {
                return false;
            }
        } else if (!learningPending.equals(other.learningPending)) {
            return false;
        }
        if (salary != other.salary) {
            return false;
        }
        if (rating != other.rating) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
                + email + ", gender=" + gender + ", newJoiner=" + newJoiner + ", learningPending=" + learningPending
                + ", salary=" + salary + ", rating=" + rating + ", getEmployeeId()=" + getEmployeeId()
                + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
                + getEmail() + ", getGender()=" + getGender() + ", getNewJoiner()=" + getNewJoiner()
                + ", getLearningPending()=" + getLearningPending() + ", getSalary()=" + getSalary() + ", getClass()="
                + getClass() + ", getRating()=" + getRating() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
