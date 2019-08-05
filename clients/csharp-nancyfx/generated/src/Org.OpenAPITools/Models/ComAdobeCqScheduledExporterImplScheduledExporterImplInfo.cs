using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScheduledExporterImplScheduledExporterImplInfo
    /// </summary>
    public sealed class ComAdobeCqScheduledExporterImplScheduledExporterImplInfo:  IEquatable<ComAdobeCqScheduledExporterImplScheduledExporterImplInfo>
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
        public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScheduledExporterImplScheduledExporterImplInfo()
        {
        }

        private ComAdobeCqScheduledExporterImplScheduledExporterImplInfo(string Pid, string Title, string Description, ComAdobeCqScheduledExporterImplScheduledExporterImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder</returns>
        public static ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder Builder()
        {
            return new ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder</returns>
        public ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScheduledExporterImplScheduledExporterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo left, ComAdobeCqScheduledExporterImplScheduledExporterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScheduledExporterImplScheduledExporterImplInfo left, ComAdobeCqScheduledExporterImplScheduledExporterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScheduledExporterImplScheduledExporterImplProperties _Properties;

            internal ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplInfoBuilder Properties(ComAdobeCqScheduledExporterImplScheduledExporterImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</returns>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScheduledExporterImplScheduledExporterImplInfo(
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