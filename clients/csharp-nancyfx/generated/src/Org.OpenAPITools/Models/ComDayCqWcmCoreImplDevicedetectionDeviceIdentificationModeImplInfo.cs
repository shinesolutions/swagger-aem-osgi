using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo:  IEquatable<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo>
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
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo()
        {
        }

        private ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo left, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo left, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties _Properties;

            internal ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoBuilder Properties(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo</returns>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo(
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