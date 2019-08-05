using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo:  IEquatable<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo>
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
        public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo()
        {
        }

        private ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo(string Pid, string Title, string Description, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo left, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo left, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties _Properties;

            internal ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoBuilder Properties(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo</returns>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo(
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