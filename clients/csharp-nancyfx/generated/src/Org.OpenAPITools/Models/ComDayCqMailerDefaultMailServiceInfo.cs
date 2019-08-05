using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerDefaultMailServiceInfo
    /// </summary>
    public sealed class ComDayCqMailerDefaultMailServiceInfo:  IEquatable<ComDayCqMailerDefaultMailServiceInfo>
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
        public ComDayCqMailerDefaultMailServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerDefaultMailServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerDefaultMailServiceInfo()
        {
        }

        private ComDayCqMailerDefaultMailServiceInfo(string Pid, string Title, string Description, ComDayCqMailerDefaultMailServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerDefaultMailServiceInfo.
        /// </summary>
        /// <returns>ComDayCqMailerDefaultMailServiceInfoBuilder</returns>
        public static ComDayCqMailerDefaultMailServiceInfoBuilder Builder()
        {
            return new ComDayCqMailerDefaultMailServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerDefaultMailServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerDefaultMailServiceInfoBuilder</returns>
        public ComDayCqMailerDefaultMailServiceInfoBuilder With()
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

        public bool Equals(ComDayCqMailerDefaultMailServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerDefaultMailServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerDefaultMailServiceInfo</param>
        /// <param name="right">Compared (ComDayCqMailerDefaultMailServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerDefaultMailServiceInfo left, ComDayCqMailerDefaultMailServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerDefaultMailServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerDefaultMailServiceInfo</param>
        /// <param name="right">Compared (ComDayCqMailerDefaultMailServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerDefaultMailServiceInfo left, ComDayCqMailerDefaultMailServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerDefaultMailServiceInfo.
        /// </summary>
        public sealed class ComDayCqMailerDefaultMailServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMailerDefaultMailServiceProperties _Properties;

            internal ComDayCqMailerDefaultMailServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMailerDefaultMailServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMailerDefaultMailServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMailerDefaultMailServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMailerDefaultMailServiceInfoBuilder Properties(ComDayCqMailerDefaultMailServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerDefaultMailServiceInfo.
            /// </summary>
            /// <returns>ComDayCqMailerDefaultMailServiceInfo</returns>
            public ComDayCqMailerDefaultMailServiceInfo Build()
            {
                Validate();
                return new ComDayCqMailerDefaultMailServiceInfo(
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