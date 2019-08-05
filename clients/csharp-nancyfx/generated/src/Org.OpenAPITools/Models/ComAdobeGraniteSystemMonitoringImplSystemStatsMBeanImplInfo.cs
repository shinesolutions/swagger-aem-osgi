using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo:  IEquatable<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo>
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
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo()
        {
        }

        private ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo(string Pid, string Title, string Description, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder</returns>
        public static ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder</returns>
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo left, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo left, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties _Properties;

            internal ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoBuilder Properties(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo</returns>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo(
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