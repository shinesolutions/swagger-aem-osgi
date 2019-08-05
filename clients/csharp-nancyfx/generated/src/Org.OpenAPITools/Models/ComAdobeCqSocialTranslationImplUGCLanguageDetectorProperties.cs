using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
    /// </summary>
    public sealed class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties:  IEquatable<ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties>
    { 
        /// <summary>
        /// EventTopics
        /// </summary>
        public ConfigNodePropertyString EventTopics { get; private set; }

        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// TranslateListenerType
        /// </summary>
        public ConfigNodePropertyArray TranslateListenerType { get; private set; }

        /// <summary>
        /// TranslatePropertyList
        /// </summary>
        public ConfigNodePropertyArray TranslatePropertyList { get; private set; }

        /// <summary>
        /// PoolSize
        /// </summary>
        public ConfigNodePropertyInteger PoolSize { get; private set; }

        /// <summary>
        /// MaxPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MaxPoolSize { get; private set; }

        /// <summary>
        /// QueueSize
        /// </summary>
        public ConfigNodePropertyInteger QueueSize { get; private set; }

        /// <summary>
        /// KeepAliveTime
        /// </summary>
        public ConfigNodePropertyInteger KeepAliveTime { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties()
        {
        }

        private ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter, ConfigNodePropertyArray TranslateListenerType, ConfigNodePropertyArray TranslatePropertyList, ConfigNodePropertyInteger PoolSize, ConfigNodePropertyInteger MaxPoolSize, ConfigNodePropertyInteger QueueSize, ConfigNodePropertyInteger KeepAliveTime)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
            this.TranslateListenerType = TranslateListenerType;
            
            this.TranslatePropertyList = TranslatePropertyList;
            
            this.PoolSize = PoolSize;
            
            this.MaxPoolSize = MaxPoolSize;
            
            this.QueueSize = QueueSize;
            
            this.KeepAliveTime = KeepAliveTime;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder</returns>
        public static ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder</returns>
        public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder With()
        {
            return Builder()
                .EventTopics(EventTopics)
                .EventFilter(EventFilter)
                .TranslateListenerType(TranslateListenerType)
                .TranslatePropertyList(TranslatePropertyList)
                .PoolSize(PoolSize)
                .MaxPoolSize(MaxPoolSize)
                .QueueSize(QueueSize)
                .KeepAliveTime(KeepAliveTime);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties left, ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties left, ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyArray _TranslateListenerType;
            private ConfigNodePropertyArray _TranslatePropertyList;
            private ConfigNodePropertyInteger _PoolSize;
            private ConfigNodePropertyInteger _MaxPoolSize;
            private ConfigNodePropertyInteger _QueueSize;
            private ConfigNodePropertyInteger _KeepAliveTime;

            internal ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.TranslateListenerType property.
            /// </summary>
            /// <param name="value">TranslateListenerType</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder TranslateListenerType(ConfigNodePropertyArray value)
            {
                _TranslateListenerType = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.TranslatePropertyList property.
            /// </summary>
            /// <param name="value">TranslatePropertyList</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder TranslatePropertyList(ConfigNodePropertyArray value)
            {
                _TranslatePropertyList = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.PoolSize property.
            /// </summary>
            /// <param name="value">PoolSize</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder PoolSize(ConfigNodePropertyInteger value)
            {
                _PoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.MaxPoolSize property.
            /// </summary>
            /// <param name="value">MaxPoolSize</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder MaxPoolSize(ConfigNodePropertyInteger value)
            {
                _MaxPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.QueueSize property.
            /// </summary>
            /// <param name="value">QueueSize</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder QueueSize(ConfigNodePropertyInteger value)
            {
                _QueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.KeepAliveTime property.
            /// </summary>
            /// <param name="value">KeepAliveTime</param>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder KeepAliveTime(ConfigNodePropertyInteger value)
            {
                _KeepAliveTime = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</returns>
            public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(
                    EventTopics: _EventTopics,
                    EventFilter: _EventFilter,
                    TranslateListenerType: _TranslateListenerType,
                    TranslatePropertyList: _TranslatePropertyList,
                    PoolSize: _PoolSize,
                    MaxPoolSize: _MaxPoolSize,
                    QueueSize: _QueueSize,
                    KeepAliveTime: _KeepAliveTime
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}