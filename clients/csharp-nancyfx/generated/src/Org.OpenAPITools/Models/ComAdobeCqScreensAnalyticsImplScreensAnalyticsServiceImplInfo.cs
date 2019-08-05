using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo:  IEquatable<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo>
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
        public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo()
        {
        }

        private ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder</returns>
        public static ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder</returns>
        public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo left, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo left, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties _Properties;

            internal ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoBuilder Properties(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo</returns>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo(
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