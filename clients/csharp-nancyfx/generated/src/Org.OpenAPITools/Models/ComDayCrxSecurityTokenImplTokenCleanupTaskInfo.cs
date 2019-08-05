using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCrxSecurityTokenImplTokenCleanupTaskInfo
    /// </summary>
    public sealed class ComDayCrxSecurityTokenImplTokenCleanupTaskInfo:  IEquatable<ComDayCrxSecurityTokenImplTokenCleanupTaskInfo>
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
        public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCrxSecurityTokenImplTokenCleanupTaskInfo()
        {
        }

        private ComDayCrxSecurityTokenImplTokenCleanupTaskInfo(string Pid, string Title, string Description, ComDayCrxSecurityTokenImplTokenCleanupTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder</returns>
        public static ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder Builder()
        {
            return new ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder</returns>
        public ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder With()
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

        public bool Equals(ComDayCrxSecurityTokenImplTokenCleanupTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo left, ComDayCrxSecurityTokenImplTokenCleanupTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCrxSecurityTokenImplTokenCleanupTaskInfo left, ComDayCrxSecurityTokenImplTokenCleanupTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.
        /// </summary>
        public sealed class ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCrxSecurityTokenImplTokenCleanupTaskProperties _Properties;

            internal ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskInfoBuilder Properties(ComDayCrxSecurityTokenImplTokenCleanupTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.
            /// </summary>
            /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskInfo</returns>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskInfo Build()
            {
                Validate();
                return new ComDayCrxSecurityTokenImplTokenCleanupTaskInfo(
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