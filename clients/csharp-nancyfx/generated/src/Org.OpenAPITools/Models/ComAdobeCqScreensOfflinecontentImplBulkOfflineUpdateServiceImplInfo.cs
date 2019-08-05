using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo:  IEquatable<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo>
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
        public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo()
        {
        }

        private ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder</returns>
        public static ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder</returns>
        public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo left, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo left, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties _Properties;

            internal ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoBuilder Properties(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo</returns>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo(
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