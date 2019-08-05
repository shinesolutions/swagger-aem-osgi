using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo
    /// </summary>
    public sealed class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo:  IEquatable<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo>
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
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo()
        {
        }

        private ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(string Pid, string Title, string Description, ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder</returns>
        public static ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder Builder()
        {
            return new ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder</returns>
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder With()
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

        public bool Equals(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo left, ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo left, ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        /// </summary>
        public sealed class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties _Properties;

            internal ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoBuilder Properties(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
            /// </summary>
            /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo</returns>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo Build()
            {
                Validate();
                return new ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(
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