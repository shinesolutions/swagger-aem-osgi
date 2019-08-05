using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmNotificationEmailImplEmailChannelInfo
    /// </summary>
    public sealed class ComDayCqWcmNotificationEmailImplEmailChannelInfo:  IEquatable<ComDayCqWcmNotificationEmailImplEmailChannelInfo>
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
        public ComDayCqWcmNotificationEmailImplEmailChannelProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmNotificationEmailImplEmailChannelInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmNotificationEmailImplEmailChannelInfo()
        {
        }

        private ComDayCqWcmNotificationEmailImplEmailChannelInfo(string Pid, string Title, string Description, ComDayCqWcmNotificationEmailImplEmailChannelProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmNotificationEmailImplEmailChannelInfo.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder</returns>
        public static ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder Builder()
        {
            return new ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder</returns>
        public ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder With()
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

        public bool Equals(ComDayCqWcmNotificationEmailImplEmailChannelInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmNotificationEmailImplEmailChannelInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationEmailImplEmailChannelInfo</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationEmailImplEmailChannelInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmNotificationEmailImplEmailChannelInfo left, ComDayCqWcmNotificationEmailImplEmailChannelInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmNotificationEmailImplEmailChannelInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationEmailImplEmailChannelInfo</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationEmailImplEmailChannelInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmNotificationEmailImplEmailChannelInfo left, ComDayCqWcmNotificationEmailImplEmailChannelInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmNotificationEmailImplEmailChannelInfo.
        /// </summary>
        public sealed class ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmNotificationEmailImplEmailChannelProperties _Properties;

            internal ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationEmailImplEmailChannelInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationEmailImplEmailChannelInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationEmailImplEmailChannelInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationEmailImplEmailChannelInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmNotificationEmailImplEmailChannelInfoBuilder Properties(ComDayCqWcmNotificationEmailImplEmailChannelProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmNotificationEmailImplEmailChannelInfo.
            /// </summary>
            /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelInfo</returns>
            public ComDayCqWcmNotificationEmailImplEmailChannelInfo Build()
            {
                Validate();
                return new ComDayCqWcmNotificationEmailImplEmailChannelInfo(
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