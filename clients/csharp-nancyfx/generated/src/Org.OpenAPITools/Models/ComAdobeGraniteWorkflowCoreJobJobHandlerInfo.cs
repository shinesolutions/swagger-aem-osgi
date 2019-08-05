using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJobJobHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJobJobHandlerInfo:  IEquatable<ComAdobeGraniteWorkflowCoreJobJobHandlerInfo>
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
        public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJobJobHandlerInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreJobJobHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreJobJobHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreJobJobHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo left, ComAdobeGraniteWorkflowCoreJobJobHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJobJobHandlerInfo left, ComAdobeGraniteWorkflowCoreJobJobHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreJobJobHandlerProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerInfoBuilder Properties(ComAdobeGraniteWorkflowCoreJobJobHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerInfo</returns>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJobJobHandlerInfo(
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