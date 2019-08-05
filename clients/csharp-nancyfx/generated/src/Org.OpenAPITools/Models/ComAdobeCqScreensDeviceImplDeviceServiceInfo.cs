using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensDeviceImplDeviceServiceInfo
    /// </summary>
    public sealed class ComAdobeCqScreensDeviceImplDeviceServiceInfo:  IEquatable<ComAdobeCqScreensDeviceImplDeviceServiceInfo>
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
        public ComAdobeCqScreensDeviceImplDeviceServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensDeviceImplDeviceServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensDeviceImplDeviceServiceInfo()
        {
        }

        private ComAdobeCqScreensDeviceImplDeviceServiceInfo(string Pid, string Title, string Description, ComAdobeCqScreensDeviceImplDeviceServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensDeviceImplDeviceServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder</returns>
        public static ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder Builder()
        {
            return new ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder</returns>
        public ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensDeviceImplDeviceServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensDeviceImplDeviceServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceImplDeviceServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceImplDeviceServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensDeviceImplDeviceServiceInfo left, ComAdobeCqScreensDeviceImplDeviceServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensDeviceImplDeviceServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceImplDeviceServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceImplDeviceServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensDeviceImplDeviceServiceInfo left, ComAdobeCqScreensDeviceImplDeviceServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensDeviceImplDeviceServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensDeviceImplDeviceServiceProperties _Properties;

            internal ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensDeviceImplDeviceServiceInfoBuilder Properties(ComAdobeCqScreensDeviceImplDeviceServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensDeviceImplDeviceServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensDeviceImplDeviceServiceInfo</returns>
            public ComAdobeCqScreensDeviceImplDeviceServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensDeviceImplDeviceServiceInfo(
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