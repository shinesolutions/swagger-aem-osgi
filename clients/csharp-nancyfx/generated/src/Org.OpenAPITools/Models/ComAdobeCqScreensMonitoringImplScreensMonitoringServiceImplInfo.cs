using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo:  IEquatable<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo>
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
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo()
        {
        }

        private ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder</returns>
        public static ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder</returns>
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo left, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo left, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties _Properties;

            internal ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoBuilder Properties(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo</returns>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(
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