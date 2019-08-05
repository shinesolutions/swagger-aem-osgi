using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo:  IEquatable<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo>
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
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo left, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo left, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoBuilder Properties(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo</returns>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo(
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