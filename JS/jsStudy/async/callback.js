console.log('1')
setTimeout(function () {
    console.log('2')
}, 1000)
setTimeout(() => console.log('2'), 1000)

console.log('3')

// synchronous callback
function printImmediatel(print) {
    print();
}
printImmediatel(() => console.log('hello'))

// Asynchronous callback
function printWithDelay(print, timeout) {
    setTimeout(print, timeout);
}
printWithDelay(() => console.log('async callback'), 2000)

// // callback Hell example
class UserStorage {
    loginUser(id, pw, onSuccess, onError) {
        setTimeout(() => {
            if (
                (id === 'apple' && pw === '1234') ||
                (id === 'banana' && pw === '1234')) {
                onSuccess(id);
            }
            else {
                onError(new Error('not found'));
            }
        }, 2000);
    }
    getRoles(user, onSuccess, onError) {
        setTimeout(() => {
            if (user === 'apple') {
                onSuccess({ name: '사과', role: '과일' });
            } else {
                onError(new Error('no access'))
            }
        }, 1000)
    }
}

const userStorage = new UserStorage();
const id = prompt('enter your id');
const pw = prompt('enter your pw');
userStorage.loginUser(id,
    pw,
    user => {
        userStorag.getRoles(user,
            userWithRole => {
                alert('Hello'+$(user.name)+'You have'+$(user.role)+'rol')
             },
            error => {
                console.log('Error')
             }
        )
    },
    error => { console.log('Error') }); // 위에서 const로 선언한 id, pw 받고 성공(success)일경우와 error일 경우도 파라미터 넣는거