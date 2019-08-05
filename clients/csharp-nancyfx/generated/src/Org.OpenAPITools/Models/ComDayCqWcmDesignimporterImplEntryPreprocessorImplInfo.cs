using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo:  IEquatable<ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo>
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
        public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo()
        {
        }

        private ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder</returns>
        public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo left, ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo left, ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties _Properties;

            internal ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoBuilder Properties(ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo</returns>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo(
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