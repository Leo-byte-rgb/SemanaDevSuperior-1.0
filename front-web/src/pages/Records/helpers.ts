import moment from 'moment';

//Formatação de datas
export const formatDate= (date: string) => {
    //Recebendo parâmetro e formatando
    return moment(date).format('DD/MM/YYYY HH:mm');

}