using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo
    /// </summary>
    public sealed class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo:  IEquatable<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo>
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
        public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo()
        {
        }

        private ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo(string Pid, string Title, string Description, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder</returns>
        public static ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder Builder()
        {
            return new ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder</returns>
        public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo left, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo left, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties _Properties;

            internal ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoBuilder Properties(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</returns>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo(
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