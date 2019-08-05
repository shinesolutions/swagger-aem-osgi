using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicationReceiverImplInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicationReceiverImplInfo:  IEquatable<ComDayCqReplicationImplReplicationReceiverImplInfo>
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
        public ComDayCqReplicationImplReplicationReceiverImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReplicationReceiverImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicationReceiverImplInfo()
        {
        }

        private ComDayCqReplicationImplReplicationReceiverImplInfo(string Pid, string Title, string Description, ComDayCqReplicationImplReplicationReceiverImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicationReceiverImplInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationReceiverImplInfoBuilder</returns>
        public static ComDayCqReplicationImplReplicationReceiverImplInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicationReceiverImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicationReceiverImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationReceiverImplInfoBuilder</returns>
        public ComDayCqReplicationImplReplicationReceiverImplInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplReplicationReceiverImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicationReceiverImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationReceiverImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationReceiverImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicationReceiverImplInfo left, ComDayCqReplicationImplReplicationReceiverImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicationReceiverImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationReceiverImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationReceiverImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicationReceiverImplInfo left, ComDayCqReplicationImplReplicationReceiverImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicationReceiverImplInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicationReceiverImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplReplicationReceiverImplProperties _Properties;

            internal ComDayCqReplicationImplReplicationReceiverImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplReplicationReceiverImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplReplicationReceiverImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplReplicationReceiverImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplReplicationReceiverImplInfoBuilder Properties(ComDayCqReplicationImplReplicationReceiverImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicationReceiverImplInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicationReceiverImplInfo</returns>
            public ComDayCqReplicationImplReplicationReceiverImplInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicationReceiverImplInfo(
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