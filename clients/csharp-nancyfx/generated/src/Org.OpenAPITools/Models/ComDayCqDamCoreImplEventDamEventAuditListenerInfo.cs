using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplEventDamEventAuditListenerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplEventDamEventAuditListenerInfo:  IEquatable<ComDayCqDamCoreImplEventDamEventAuditListenerInfo>
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
        public ComDayCqDamCoreImplEventDamEventAuditListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplEventDamEventAuditListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplEventDamEventAuditListenerInfo()
        {
        }

        private ComDayCqDamCoreImplEventDamEventAuditListenerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplEventDamEventAuditListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplEventDamEventAuditListenerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder</returns>
        public static ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder</returns>
        public ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplEventDamEventAuditListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplEventDamEventAuditListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplEventDamEventAuditListenerInfo left, ComDayCqDamCoreImplEventDamEventAuditListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplEventDamEventAuditListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplEventDamEventAuditListenerInfo left, ComDayCqDamCoreImplEventDamEventAuditListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplEventDamEventAuditListenerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplEventDamEventAuditListenerProperties _Properties;

            internal ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerInfoBuilder Properties(ComDayCqDamCoreImplEventDamEventAuditListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplEventDamEventAuditListenerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerInfo</returns>
            public ComDayCqDamCoreImplEventDamEventAuditListenerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplEventDamEventAuditListenerInfo(
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