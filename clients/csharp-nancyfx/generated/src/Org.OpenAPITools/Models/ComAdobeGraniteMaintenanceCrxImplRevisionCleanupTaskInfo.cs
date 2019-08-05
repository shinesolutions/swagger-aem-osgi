using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo:  IEquatable<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo>
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
        public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo(string Pid, string Title, string Description, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo left, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo left, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties _Properties;

            internal ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoBuilder Properties(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo</returns>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo(
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