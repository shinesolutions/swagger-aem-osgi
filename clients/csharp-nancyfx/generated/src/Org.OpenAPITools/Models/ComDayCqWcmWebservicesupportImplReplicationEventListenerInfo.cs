using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo
    /// </summary>
    public sealed class ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo:  IEquatable<ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo>
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
        public ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo()
        {
        }

        private ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo(string Pid, string Title, string Description, ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder</returns>
        public static ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder Builder()
        {
            return new ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder</returns>
        public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo left, ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo left, ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties _Properties;

            internal ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfoBuilder Properties(ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo</returns>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo(
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