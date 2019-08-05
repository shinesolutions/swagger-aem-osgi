using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo:  IEquatable<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo>
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
        public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo()
        {
        }

        private ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder</returns>
        public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo left, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo left, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties _Properties;

            internal ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoBuilder Properties(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo</returns>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo(
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