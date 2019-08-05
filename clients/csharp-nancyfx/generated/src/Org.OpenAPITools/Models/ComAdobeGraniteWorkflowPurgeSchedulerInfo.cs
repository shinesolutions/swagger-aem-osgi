using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowPurgeSchedulerInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowPurgeSchedulerInfo:  IEquatable<ComAdobeGraniteWorkflowPurgeSchedulerInfo>
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
        public ComAdobeGraniteWorkflowPurgeSchedulerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowPurgeSchedulerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowPurgeSchedulerInfo()
        {
        }

        private ComAdobeGraniteWorkflowPurgeSchedulerInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowPurgeSchedulerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowPurgeSchedulerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder</returns>
        public ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowPurgeSchedulerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowPurgeSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowPurgeSchedulerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowPurgeSchedulerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowPurgeSchedulerInfo left, ComAdobeGraniteWorkflowPurgeSchedulerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowPurgeSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowPurgeSchedulerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowPurgeSchedulerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowPurgeSchedulerInfo left, ComAdobeGraniteWorkflowPurgeSchedulerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowPurgeSchedulerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowPurgeSchedulerProperties _Properties;

            internal ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerInfoBuilder Properties(ComAdobeGraniteWorkflowPurgeSchedulerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowPurgeSchedulerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerInfo</returns>
            public ComAdobeGraniteWorkflowPurgeSchedulerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowPurgeSchedulerInfo(
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