using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamEventPurgeServiceInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamEventPurgeServiceInfo:  IEquatable<ComDayCqDamCoreImplDamEventPurgeServiceInfo>
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
        public ComDayCqDamCoreImplDamEventPurgeServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamEventPurgeServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamEventPurgeServiceInfo()
        {
        }

        private ComDayCqDamCoreImplDamEventPurgeServiceInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplDamEventPurgeServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamEventPurgeServiceInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder</returns>
        public static ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder</returns>
        public ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplDamEventPurgeServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamEventPurgeServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventPurgeServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventPurgeServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamEventPurgeServiceInfo left, ComDayCqDamCoreImplDamEventPurgeServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamEventPurgeServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventPurgeServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventPurgeServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamEventPurgeServiceInfo left, ComDayCqDamCoreImplDamEventPurgeServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamEventPurgeServiceInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplDamEventPurgeServiceProperties _Properties;

            internal ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplDamEventPurgeServiceInfoBuilder Properties(ComDayCqDamCoreImplDamEventPurgeServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamEventPurgeServiceInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamEventPurgeServiceInfo</returns>
            public ComDayCqDamCoreImplDamEventPurgeServiceInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamEventPurgeServiceInfo(
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