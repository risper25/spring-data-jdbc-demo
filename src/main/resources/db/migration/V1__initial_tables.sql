-- AppUser Table
CREATE TABLE appuser(
    user_id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Category Table
CREATE TABLE category(
    category_id BIGSERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL UNIQUE
);

-- Task Table
CREATE TABLE task(
    task_id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    text TEXT,
    is_complete BOOLEAN,
    date DATE,
    user_id BIGINT REFERENCES AppUser(user_id),
    category_id BIGINT REFERENCES category(category_id)
);

-- TaskCategory Table
CREATE TABLE taskcategory(
    task_id BIGINT REFERENCES task(task_id),
    category_id BIGINT REFERENCES category(category_id),
    PRIMARY KEY (task_id, category_id)
);
