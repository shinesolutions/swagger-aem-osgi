using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo>
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
        public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo(string Pid, string Title, string Description, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties _Properties;

            internal ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoBuilder Properties(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo(
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