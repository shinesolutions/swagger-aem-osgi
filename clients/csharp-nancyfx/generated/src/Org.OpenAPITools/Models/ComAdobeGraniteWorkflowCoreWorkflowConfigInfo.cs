using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreWorkflowConfigInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreWorkflowConfigInfo:  IEquatable<ComAdobeGraniteWorkflowCoreWorkflowConfigInfo>
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
        public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreWorkflowConfigInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreWorkflowConfigInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreWorkflowConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreWorkflowConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo left, ComAdobeGraniteWorkflowCoreWorkflowConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreWorkflowConfigInfo left, ComAdobeGraniteWorkflowCoreWorkflowConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreWorkflowConfigProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigInfoBuilder Properties(ComAdobeGraniteWorkflowCoreWorkflowConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigInfo</returns>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreWorkflowConfigInfo(
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