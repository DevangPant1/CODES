import numpy as np
from keras.models import Sequential
from keras.layers import Dense

# Generate some training data
X_train = np.random.rand(1000, 10)
y_train = np.sum(X_train, axis=1)

# Define the model architecture
model = Sequential()
model.add(Dense(20, input_dim=10, activation='relu'))
model.add(Dense(1, activation='linear'))

# Compile the model
model.compile(loss='mse', optimizer='adam')

# Train the model
model.fit(X_train, y_train, epochs=100, batch_size=32)

# Generate some test data
X_test = np.random.rand(100, 10)
y_test = np.sum(X_test, axis=1)

# Evaluate the model on the test data
mse = model.evaluate(X_test, y_test)
print('Mean squared error on test data:', mse)
