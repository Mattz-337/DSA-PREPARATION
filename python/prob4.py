# Hospital Record System using Parallel Arrays


def display_patients(patient_id, patient_name, patient_age,
                     doctor_name, lab_test):

    print("\n------ PATIENT RECORDS ------")

    print("ID\tName\tAge\tDoctor\t\tLab Test")

    for i in range(len(patient_id)):

        print(
            patient_id[i],
            "\t",
            patient_name[i],
            "\t",
            patient_age[i],
            "\t",
            doctor_name[i],
            "\t",
            lab_test[i]
        )


def display_doctors(doctor_id, doctor_name):

    print("\n------ DOCTOR DETAILS ------")

    print("Doctor ID\tDoctor Name")

    for i in range(len(doctor_id)):

        print(
            doctor_id[i],
            "\t\t",
            doctor_name[i]
        )


def display_labs(lab_id, lab_test):

    print("\n------ LAB TEST DETAILS ------")

    print("Lab ID\tTest Name")

    for i in range(len(lab_id)):

        print(
            lab_id[i],
            "\t",
            lab_test[i]
        )


def add_patient(patient_id, patient_name, patient_age,
                doctor_name, lab_test):

    print("\nEnter New Patient Details")

    id = int(input("Patient ID: "))
    name = input("Name: ")
    age = int(input("Age: "))
    doctor = input("Doctor Name: ")
    test = input("Lab Test: ")


    patient_id.append(id)
    patient_name.append(name)
    patient_age.append(age)

    doctor_name.append(doctor)
    lab_test.append(test)


    print("Patient Added Successfully!")


def search_patient(patient_id, patient_name,
                   patient_age, doctor_name,
                   lab_test):

    search = int(input("Enter Patient ID: "))

    found = False

    for i in range(len(patient_id)):

        if patient_id[i] == search:

            print("\nPatient Found")

            print("Name:", patient_name[i])
            print("Age:", patient_age[i])
            print("Doctor:", doctor_name[i])
            print("Lab Test:", lab_test[i])

            found = True
            break


    if found == False:
        print("Patient not found")


# Main data

patient_id = [101,102,103]

patient_name = [
    "John",
    "David",
    "Alex"
]

patient_age = [
    25,
    32,
    40
]


doctor_id = [
    "D01",
    "D02",
    "D03"
]

doctor_name = [
    "Dr.Smith",
    "Dr.James",
    "Dr.Brown"
]


lab_id = [
    "L01",
    "L02",
    "L03"
]

lab_test = [
    "Blood Test",
    "Urine Test",
    "X-Ray"
]


while True:

    print("\n===== HOSPITAL MANAGEMENT =====")

    print("1. Display Patient Records")
    print("2. Add Patient")
    print("3. Search Patient")
    print("4. Display Doctors")
    print("5. Display Lab Tests")
    print("6. Exit")


    choice = int(input("Enter choice: "))


    if choice == 1:

        display_patients(
            patient_id,
            patient_name,
            patient_age,
            doctor_name,
            lab_test
        )


    elif choice == 2:

        add_patient(
            patient_id,
            patient_name,
            patient_age,
            doctor_name,
            lab_test
        )


    elif choice == 3:

        search_patient(
            patient_id,
            patient_name,
            patient_age,
            doctor_name,
            lab_test
        )


    elif choice == 4:

        display_doctors(
            doctor_id,
            doctor_name
        )


    elif choice == 5:

        display_labs(
            lab_id,
            lab_test
        )


    elif choice == 6:

        print("Program Ended")
        break


    else:

        print("Invalid Choice")