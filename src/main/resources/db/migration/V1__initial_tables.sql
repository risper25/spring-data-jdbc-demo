-- AppUser Table
CREATE TABLE AppUser (
    user_id BIGSERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Category Table
CREATE TABLE Category (
    category_id BIGSERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL
);

-- Task Table
CREATE TABLE Task (
    task_id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    text TEXT,
    isComplete BOOLEAN,
    date DATE,
    appUser_id BIGINT REFERENCES AppUser(user_id)
);

-- TaskCategory Table
CREATE TABLE TaskCategory (
    task_id BIGINT REFERENCES Task(task_id),
    category_id BIGINT REFERENCES Category(category_id),
    PRIMARY KEY (task_id, category_id)
);
