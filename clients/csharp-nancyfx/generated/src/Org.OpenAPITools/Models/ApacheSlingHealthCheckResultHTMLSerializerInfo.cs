using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ApacheSlingHealthCheckResultHTMLSerializerInfo
    /// </summary>
    public sealed class ApacheSlingHealthCheckResultHTMLSerializerInfo:  IEquatable<ApacheSlingHealthCheckResultHTMLSerializerInfo>
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
        public ApacheSlingHealthCheckResultHTMLSerializerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ApacheSlingHealthCheckResultHTMLSerializerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ApacheSlingHealthCheckResultHTMLSerializerInfo()
        {
        }

        private ApacheSlingHealthCheckResultHTMLSerializerInfo(string Pid, string Title, string Description, ApacheSlingHealthCheckResultHTMLSerializerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ApacheSlingHealthCheckResultHTMLSerializerInfo.
        /// </summary>
        /// <returns>ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder</returns>
        public static ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder Builder()
        {
            return new ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder();
        }

        /// <summary>
        /// Returns ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder</returns>
        public ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder With()
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

        public bool Equals(ApacheSlingHealthCheckResultHTMLSerializerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ApacheSlingHealthCheckResultHTMLSerializerInfo.
        /// </summary>
        /// <param name="left">Compared (ApacheSlingHealthCheckResultHTMLSerializerInfo</param>
        /// <param name="right">Compared (ApacheSlingHealthCheckResultHTMLSerializerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ApacheSlingHealthCheckResultHTMLSerializerInfo left, ApacheSlingHealthCheckResultHTMLSerializerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ApacheSlingHealthCheckResultHTMLSerializerInfo.
        /// </summary>
        /// <param name="left">Compared (ApacheSlingHealthCheckResultHTMLSerializerInfo</param>
        /// <param name="right">Compared (ApacheSlingHealthCheckResultHTMLSerializerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ApacheSlingHealthCheckResultHTMLSerializerInfo left, ApacheSlingHealthCheckResultHTMLSerializerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ApacheSlingHealthCheckResultHTMLSerializerInfo.
        /// </summary>
        public sealed class ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ApacheSlingHealthCheckResultHTMLSerializerProperties _Properties;

            internal ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ApacheSlingHealthCheckResultHTMLSerializerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApacheSlingHealthCheckResultHTMLSerializerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApacheSlingHealthCheckResultHTMLSerializerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApacheSlingHealthCheckResultHTMLSerializerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ApacheSlingHealthCheckResultHTMLSerializerInfoBuilder Properties(ApacheSlingHealthCheckResultHTMLSerializerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ApacheSlingHealthCheckResultHTMLSerializerInfo.
            /// </summary>
            /// <returns>ApacheSlingHealthCheckResultHTMLSerializerInfo</returns>
            public ApacheSlingHealthCheckResultHTMLSerializerInfo Build()
            {
                Validate();
                return new ApacheSlingHealthCheckResultHTMLSerializerInfo(
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