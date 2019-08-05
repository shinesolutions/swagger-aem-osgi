using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplHTTPAuthHandlerInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplHTTPAuthHandlerInfo:  IEquatable<ComDayCqWcmFoundationImplHTTPAuthHandlerInfo>
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
        public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo()
        {
        }

        private ComDayCqWcmFoundationImplHTTPAuthHandlerInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationImplHTTPAuthHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder</returns>
        public static ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder</returns>
        public ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationImplHTTPAuthHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo left, ComDayCqWcmFoundationImplHTTPAuthHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo left, ComDayCqWcmFoundationImplHTTPAuthHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationImplHTTPAuthHandlerProperties _Properties;

            internal ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerInfoBuilder Properties(ComDayCqWcmFoundationImplHTTPAuthHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerInfo</returns>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplHTTPAuthHandlerInfo(
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