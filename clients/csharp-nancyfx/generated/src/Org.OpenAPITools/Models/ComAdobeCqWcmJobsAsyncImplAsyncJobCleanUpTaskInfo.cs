using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo>
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
        public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo(string Pid, string Title, string Description, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo left, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo left, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties _Properties;

            internal ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoBuilder Properties(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo(
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