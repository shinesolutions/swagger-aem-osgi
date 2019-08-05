using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// MessagingUserComponentFactoryInfo
    /// </summary>
    public sealed class MessagingUserComponentFactoryInfo:  IEquatable<MessagingUserComponentFactoryInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public MessagingUserComponentFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MessagingUserComponentFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MessagingUserComponentFactoryInfo()
        {
        }

        private MessagingUserComponentFactoryInfo(string Pid, string Title, string Description, MessagingUserComponentFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of MessagingUserComponentFactoryInfo.
        /// </summary>
        /// <returns>MessagingUserComponentFactoryInfoBuilder</returns>
        public static MessagingUserComponentFactoryInfoBuilder Builder()
        {
            return new MessagingUserComponentFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns MessagingUserComponentFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MessagingUserComponentFactoryInfoBuilder</returns>
        public MessagingUserComponentFactoryInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MessagingUserComponentFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MessagingUserComponentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (MessagingUserComponentFactoryInfo</param>
        /// <param name="right">Compared (MessagingUserComponentFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MessagingUserComponentFactoryInfo left, MessagingUserComponentFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MessagingUserComponentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (MessagingUserComponentFactoryInfo</param>
        /// <param name="right">Compared (MessagingUserComponentFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MessagingUserComponentFactoryInfo left, MessagingUserComponentFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MessagingUserComponentFactoryInfo.
        /// </summary>
        public sealed class MessagingUserComponentFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private MessagingUserComponentFactoryProperties _Properties;

            internal MessagingUserComponentFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MessagingUserComponentFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public MessagingUserComponentFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagingUserComponentFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public MessagingUserComponentFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagingUserComponentFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public MessagingUserComponentFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagingUserComponentFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public MessagingUserComponentFactoryInfoBuilder Properties(MessagingUserComponentFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MessagingUserComponentFactoryInfo.
            /// </summary>
            /// <returns>MessagingUserComponentFactoryInfo</returns>
            public MessagingUserComponentFactoryInfo Build()
            {
                Validate();
                return new MessagingUserComponentFactoryInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}