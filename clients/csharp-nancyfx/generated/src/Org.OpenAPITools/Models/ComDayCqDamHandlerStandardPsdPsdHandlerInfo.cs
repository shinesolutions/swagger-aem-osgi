using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPsdPsdHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPsdPsdHandlerInfo:  IEquatable<ComDayCqDamHandlerStandardPsdPsdHandlerInfo>
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
        public ComDayCqDamHandlerStandardPsdPsdHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPsdPsdHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPsdPsdHandlerInfo()
        {
        }

        private ComDayCqDamHandlerStandardPsdPsdHandlerInfo(string Pid, string Title, string Description, ComDayCqDamHandlerStandardPsdPsdHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPsdPsdHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder</returns>
        public static ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder</returns>
        public ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamHandlerStandardPsdPsdHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPsdPsdHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPsdPsdHandlerInfo left, ComDayCqDamHandlerStandardPsdPsdHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPsdPsdHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPsdPsdHandlerInfo left, ComDayCqDamHandlerStandardPsdPsdHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPsdPsdHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamHandlerStandardPsdPsdHandlerProperties _Properties;

            internal ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsdPsdHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsdPsdHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsdPsdHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsdPsdHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamHandlerStandardPsdPsdHandlerInfoBuilder Properties(ComDayCqDamHandlerStandardPsdPsdHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPsdPsdHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerInfo</returns>
            public ComDayCqDamHandlerStandardPsdPsdHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPsdPsdHandlerInfo(
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