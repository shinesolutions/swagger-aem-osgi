using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo>
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
        public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo</returns>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo(
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