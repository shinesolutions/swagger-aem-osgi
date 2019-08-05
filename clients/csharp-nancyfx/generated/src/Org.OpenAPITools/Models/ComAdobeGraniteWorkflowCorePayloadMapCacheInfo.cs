using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCorePayloadMapCacheInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCorePayloadMapCacheInfo:  IEquatable<ComAdobeGraniteWorkflowCorePayloadMapCacheInfo>
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
        public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCorePayloadMapCacheInfo()
        {
        }

        private ComAdobeGraniteWorkflowCorePayloadMapCacheInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCorePayloadMapCacheProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCorePayloadMapCacheInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo left, ComAdobeGraniteWorkflowCorePayloadMapCacheInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCorePayloadMapCacheInfo left, ComAdobeGraniteWorkflowCorePayloadMapCacheInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCorePayloadMapCacheProperties _Properties;

            internal ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheInfoBuilder Properties(ComAdobeGraniteWorkflowCorePayloadMapCacheProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCacheInfo</returns>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCorePayloadMapCacheInfo(
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