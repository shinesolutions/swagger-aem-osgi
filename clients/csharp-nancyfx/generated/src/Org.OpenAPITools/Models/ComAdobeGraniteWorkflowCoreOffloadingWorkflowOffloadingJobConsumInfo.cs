using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo:  IEquatable<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo>
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
        public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo left, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo left, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoBuilder Properties(ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo</returns>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo(
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