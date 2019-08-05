using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerImplCqMailingServiceInfo
    /// </summary>
    public sealed class ComDayCqMailerImplCqMailingServiceInfo:  IEquatable<ComDayCqMailerImplCqMailingServiceInfo>
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
        public ComDayCqMailerImplCqMailingServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerImplCqMailingServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerImplCqMailingServiceInfo()
        {
        }

        private ComDayCqMailerImplCqMailingServiceInfo(string Pid, string Title, string Description, ComDayCqMailerImplCqMailingServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerImplCqMailingServiceInfo.
        /// </summary>
        /// <returns>ComDayCqMailerImplCqMailingServiceInfoBuilder</returns>
        public static ComDayCqMailerImplCqMailingServiceInfoBuilder Builder()
        {
            return new ComDayCqMailerImplCqMailingServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerImplCqMailingServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerImplCqMailingServiceInfoBuilder</returns>
        public ComDayCqMailerImplCqMailingServiceInfoBuilder With()
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

        public bool Equals(ComDayCqMailerImplCqMailingServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerImplCqMailingServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplCqMailingServiceInfo</param>
        /// <param name="right">Compared (ComDayCqMailerImplCqMailingServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerImplCqMailingServiceInfo left, ComDayCqMailerImplCqMailingServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerImplCqMailingServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplCqMailingServiceInfo</param>
        /// <param name="right">Compared (ComDayCqMailerImplCqMailingServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerImplCqMailingServiceInfo left, ComDayCqMailerImplCqMailingServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerImplCqMailingServiceInfo.
        /// </summary>
        public sealed class ComDayCqMailerImplCqMailingServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMailerImplCqMailingServiceProperties _Properties;

            internal ComDayCqMailerImplCqMailingServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplCqMailingServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMailerImplCqMailingServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplCqMailingServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMailerImplCqMailingServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplCqMailingServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMailerImplCqMailingServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplCqMailingServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMailerImplCqMailingServiceInfoBuilder Properties(ComDayCqMailerImplCqMailingServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerImplCqMailingServiceInfo.
            /// </summary>
            /// <returns>ComDayCqMailerImplCqMailingServiceInfo</returns>
            public ComDayCqMailerImplCqMailingServiceInfo Build()
            {
                Validate();
                return new ComDayCqMailerImplCqMailingServiceInfo(
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