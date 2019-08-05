using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo:  IEquatable<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo>
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
        public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo()
        {
        }

        private ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder</returns>
        public static ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder</returns>
        public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo left, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo left, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties _Properties;

            internal ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder Properties(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo</returns>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo(
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