using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWorkflowImplEmailEMailNotificationServiceInfo
    /// </summary>
    public sealed class ComDayCqWorkflowImplEmailEMailNotificationServiceInfo:  IEquatable<ComDayCqWorkflowImplEmailEMailNotificationServiceInfo>
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
        public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWorkflowImplEmailEMailNotificationServiceInfo()
        {
        }

        private ComDayCqWorkflowImplEmailEMailNotificationServiceInfo(string Pid, string Title, string Description, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder</returns>
        public static ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder Builder()
        {
            return new ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder</returns>
        public ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder With()
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

        public bool Equals(ComDayCqWorkflowImplEmailEMailNotificationServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo left, ComDayCqWorkflowImplEmailEMailNotificationServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWorkflowImplEmailEMailNotificationServiceInfo left, ComDayCqWorkflowImplEmailEMailNotificationServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.
        /// </summary>
        public sealed class ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWorkflowImplEmailEMailNotificationServiceProperties _Properties;

            internal ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceInfoBuilder Properties(ComDayCqWorkflowImplEmailEMailNotificationServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWorkflowImplEmailEMailNotificationServiceInfo.
            /// </summary>
            /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServiceInfo</returns>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceInfo Build()
            {
                Validate();
                return new ComDayCqWorkflowImplEmailEMailNotificationServiceInfo(
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