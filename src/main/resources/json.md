GET(@PathParam)
http://localhost:8080/api/search/patients?name=j

OR(@PathVariable)
http://localhost:8080/api/search/patients/J


POST
http://localhost:8080/api/search/addpatients


[
    {
        "patientName": "John Doe",
        "patientIllness": "Fever",
        "age": "30",
        "location": "New York",
        "email": "john.doe@example.com",
        "mobile": "+1 123-456-7890"
    },
    {
        "patientName": "Jane Smith",
        "patientIllness": "Migraine",
        "age": "35",
        "location": "Los Angeles",
        "email": "jane.smith@example.com",
        "mobile": "+1 987-654-3210"
    },
    {
        "patientName": "Alice Johnson",
        "patientIllness": "Allergies",
        "age": "25",
        "location": "Chicago",
        "email": "alice.johnson@example.com",
        "mobile": "+1 555-555-5555"
    },
    {
        "patientName": "Bob Anderson",
        "patientIllness": "Broken Arm",
        "age": "40",
        "location": "Houston",
        "email": "bob.anderson@example.com",
        "mobile": "+1 777-777-7777"
    },
    {
        "patientName": "Emily Wilson",
        "patientIllness": "Flu",
        "age": "28",
        "location": "San Francisco",
        "email": "emily.wilson@example.com",
        "mobile": "+1 222-333-4444"
    },
    {
        "patientName": "David Lee",
        "patientIllness": "Sprained Ankle",
        "age": "45",
        "location": "Miami",
        "email": "david.lee@example.com",
        "mobile": "+1 123-987-6543"
    },
    {
        "patientName": "Grace Martin",
        "patientIllness": "Stomachache",
        "age": "22",
        "location": "Dallas",
        "email": "grace.martin@example.com",
        "mobile": "+1 555-123-9876"
    },
    {
        "patientName": "Samuel White",
        "patientIllness": "Headache",
        "age": "33",
        "location": "Seattle",
        "email": "samuel.white@example.com",
        "mobile": "+1 111-222-3333"
    },
    {
        "patientName": "Olivia Davis",
        "patientIllness": "Cough",
        "age": "29",
        "location": "Boston",
        "email": "olivia.davis@example.com",
        "mobile": "+1 999-888-7777"
    },
    {
        "patientName": "Daniel Harris",
        "patientIllness": "Sore Throat",
        "age": "31",
        "location": "Denver",
        "email": "daniel.harris@example.com",
        "mobile": "+1 777-888-9999"
    }
]

