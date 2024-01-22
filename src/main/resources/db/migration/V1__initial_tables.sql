-- AppUser Table
CREATE TABLE AppUser (
    user_id BIGSERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- TaskGroup Table
CREATE TABLE TaskGroup (
    group_id BIGSERIAL PRIMARY KEY,
    appUser_id BIGINT REFERENCES AppUser(user_id),
    FOREIGN KEY (appUser_id) REFERENCES AppUser(user_id)
);

-- Task Table
CREATE TABLE Task (
    task_id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    text TEXT,
    isComplete BOOLEAN,
    date DATE,
    taskGroup_id BIGINT REFERENCES TaskGroup(group_id),
    category_id BIGINT REFERENCES Category(category_id),
    FOREIGN KEY (taskGroup_id) REFERENCES TaskGroup(group_id),
    FOREIGN KEY (category_id) REFERENCES Category(category_id)
);

-- Category Table
CREATE TABLE Category (
    category_id BIGSERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL
);
