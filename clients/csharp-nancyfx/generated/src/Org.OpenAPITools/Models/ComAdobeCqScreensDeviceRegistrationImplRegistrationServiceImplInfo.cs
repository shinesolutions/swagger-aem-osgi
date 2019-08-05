using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo:  IEquatable<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo>
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
        public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo()
        {
        }

        private ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder</returns>
        public static ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder</returns>
        public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo left, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo left, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties _Properties;

            internal ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoBuilder Properties(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo</returns>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo(
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